package lab.bean;



public class Project 
{
	private  int projectId;
	private String projectName;
	private String duration;
	
	
	public Project(int projectId, String projectName, String duration)
	{
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	}


	public String getProjectInfo() {
        return projectName + " (" + duration + ")";
    }

    public void showProjectDetails() {
        System.out.println("Project: " + projectName + 
                           " | Duration: " + duration);
    }
	
	
	

}
