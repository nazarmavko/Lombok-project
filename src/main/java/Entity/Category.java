package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "category")
@Getter @Setter
@NoArgsConstructor
public class Category extends BaseEntity{

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", getId()=" + getId() + "]";
	}


	
}
