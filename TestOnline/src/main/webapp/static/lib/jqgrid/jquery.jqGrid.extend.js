jQuery(function($){
	// 修改jqgrid的默认值
	$.jgrid.defaults = {
			viewrecords:true, // 是否显示起始记录数
			rowNum: 10,	// 每页显示记录数
			rowList: [10, 20, 30, 40, 50], // 每页先试试记录数的列表
			regional: "cn" //语言，默认中文
	}
});

(function($){
	
	/**
	 * 数据表格工具
	 */
	$.jqGridUtil = {
		
		/**
		 * 某些操作（例如给jqGrid加载数据）不能直接通过$(id)这个选择器进行操作，必须是$(id)[0]
		 * @param id
		 * @returns
		 */
		grid0: function(id) {
			return $("#" + id)[0];
		},
		
		/**
		 * 将服务器返回的数据转存jqGrid可以识别的格式
		 * Frame返回的业务数据格式大致是这样：
		 * {
		 * 	rows: {多行业务数据},
		 *  total: '记录总条数',
		 * }
		 * 但jqGrid能够识别的数据格式是：
		 * {
		 * 	rows: {多行业务数据},
		 * 	records: {记录总条数},
		 * 	total: {总页数},
		 * 	page: {当前页码}
		 * }
		 * @param 	serverData	服务器返回的数据
		 * @param 	postData	包含了页码，每页记录数等数据
		 * @return 	转换后的数据
		 */
		toJqGridFmt: function(serverData, postData) {
			// postData是jqGrid提供的数据结构，和jqGrid加载数据时的rows含义又不相同，这里指每页记录数
			// 因此需要用Frame返回的total（即总记录数）除以postData.rows（即每页记录数）得出总页数，赋值给新的total
			var total = Math.ceil(serverData.total * 1.0 / postData.rows);
			//原来的total赋值给records
			serverData.records = serverData.total;
			serverData.total = total;
			serverData.page = postData.page;
			return serverData;
		},
		
		/**
		 * 获取数据表格的选项
		 * @param	id		数据表格的id
		 * @param	option	要获取的选项名称，如果为空，则获取全部选项
		 */
		options: function(id, option) {
			var grid = this.grid0(id);
			if(!option){
				return grid.p;
			}
			return grid.p[option];
		},
		
		/**
		 * 获取数据表格点钱选择的行
		 * @param id
		 * @returns
		 */
		getSelectedRow: function(id) {
			var selIndex = this.options(id, "selrow");
			if(!selIndex){
				return null;
			}
			return $("#" + id).jqGrid("getRowData", selIndex);
		},
		
		getSelectedRows: function(id) {
			var idArr = $("#" + id).getGridParam("selarrrow");
			var length = idArr.length;
			if(length > 0) {
				var rows = [];
				for(var i in idArr) {
					rows.push($("#" + id).getRowData(idArr[i]));
				}
				return rows;
			} else {
				return [];
			}
		},
		
		/**
		 * 为数据表格加载数据
		 * @param	id		数据表格的id
		 * @param	data	服务器返回的数据
		 */
		loadData: function(id, data) {
			$("#" + id).clearGridData();
			if(data.total) {
				$("#" + id)[0].addJSONData(this.toJqGridFmt(data, this.options(id, "postData")));
			} else {
				$("#" + id)[0].addJSONData(data);
			}
			
		},
		
		/**
		 * 刷新jqGrid的数据
		 * @param	id		数据表格的id
		 */
		refresh: function(id, page) {
			var postData = this.options(id, "postData");
			// 刷新时跳转到第一页
			postData.page = page || 1;
			var dataType = this.options(id, "datatype");
			// 调用获取数据的函数刷新具体的表格。jqGrid可以使用多种方式的数据源，本系统统一使用用户自定义函数（函数自己与后台交互）
			// 获取数据的方式
			if($.isFunction(dataType)){
				dataType(postData);
			}
		}
	}
})(jQuery);