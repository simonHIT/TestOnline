package com.testOnline.model;

public class CourseResources {
    private Integer resourcesId;

    private Integer courseid;

    private String resourcesname;

    private String resources;

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getResourcesname() {
        return resourcesname;
    }

    public void setResourcesname(String resourcesname) {
        this.resourcesname = resourcesname == null ? null : resourcesname.trim();
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources == null ? null : resources.trim();
    }
}