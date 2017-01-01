package donkey.fixture;

import donkey.Model;
import donkey.ModelTest;

/**
 * Concrete model class for testing.
 */
public class ConcreteModel5 extends Model {
  /**
   * String field.
   */
  public String field;

  /**
   * Model relation.
   */
  public ConcreteModel4 model;

  /**
   * Initialize a model.
   */
  public ConcreteModel5() {
    super("test1", ModelTest.db());
  }
}
