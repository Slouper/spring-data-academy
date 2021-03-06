package cz.inventi.springdataacademy.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class MenuEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Boolean enabled;

  @OneToMany(mappedBy = "menu")
  private final List<MenuItemEntity> menuItems = new ArrayList<>();

  public MenuEntity() {
  }

  public MenuEntity(Long id, String name, Boolean enabled) {
    this.id = id;
    this.name = name;
    this.enabled = enabled;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuEntity that = (MenuEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled);
  }

  @Override
  public String toString() {
    return "MenuEntity{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", enabled=" + enabled +
           '}';
  }
}
