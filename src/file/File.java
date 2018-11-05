package file;


/*
 * Class demonstrates Folder
 */
public class File {

	private String name;
	private String location;
	private String metaData;

	public File() {

	}
	public File(String name, String location) {
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMetaData() {
		return metaData;
	}
	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}
	

	
}
