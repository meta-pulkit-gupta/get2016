package session1;

/*
 * Bean for Titles table
 */
public class Titles {

	private String title_id;
	private String title_name;
	private String subject_id;
	private String publisher_id;

	public Titles() {

	}

	public Titles(String title_id, String title_name, String subject_id,
			String publisher_id) {
		this.title_id = title_id;
		this.title_name = title_name;
		this.subject_id = subject_id;
		this.publisher_id = publisher_id;
	}

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public String getTitle_name() {
		return title_name;
	}

	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public String getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(String publisher_id) {
		this.publisher_id = publisher_id;
	}

	@Override
	public String toString() {
		return title_name;
	}
}
