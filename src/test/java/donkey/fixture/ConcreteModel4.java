package donkey.fixture;

import java.util.List;

import donkey.Model;
import donkey.ModelTest;

/**
 * Concrete model class for testing.
 */
public class ConcreteModel4 extends Model {
  /**
   * String field.
   */
  public String field;

  /**
   * Inverse model relation.
   */
  public List<ConcreteModel5> models;

  /**
   * Initialize a model.
   */
  public ConcreteModel4() {
    super("test2", ModelTest.db());
  }
}
