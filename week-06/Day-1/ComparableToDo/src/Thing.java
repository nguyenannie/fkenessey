public class Thing implements Comparable{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Object o) {
    Thing thingToCompare = (Thing) o;
    int output = 0;
    if (this.completed && thingToCompare.completed && (this.name.charAt(0) == thingToCompare.name.charAt(0))) {
      output = 0;
    } else if (this.completed && thingToCompare.completed && (this.name.charAt(0) > thingToCompare.name.charAt(0))) {
      output = 1;
    } else if (this.completed && thingToCompare.completed && (this.name.charAt(0) < thingToCompare.name.charAt(0))){
      output = -1;
    } else if (this.completed && !thingToCompare.completed) {
      output = -1;
    } else if (!this.completed && !thingToCompare.completed && (this.name.charAt(0) == thingToCompare.name.charAt(0))){
      output = 0;
    } else if (!this.completed && !thingToCompare.completed && (this.name.charAt(0) > thingToCompare.name.charAt(0))) {
      output = 1;
    } else if (!this.completed && !thingToCompare.completed && (this.name.charAt(0) < thingToCompare.name.charAt(0))) {
      output = -1;
    }
    return output;
  }
}
