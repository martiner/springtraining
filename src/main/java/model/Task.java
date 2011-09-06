package model;


public class Task {

	private Long id;
	
	private String title;
	
	private Prio prio = Prio.normal;
	
	private String text;
	
	public Task() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Prio getPrio() {
		return prio;
	}

	public void setPrio(Prio prio) {
		this.prio = prio;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
