package donkey.fixture;

import donkey.Model;
import donkey.ModelTest;

/**
 * Concrete model class for testing.
 */
public class ConcreteModel3 extends Model {
  /**
   * String field.
   */
  public String field;

  /**
   * Initialize a model.
   */
  public ConcreteModel3() {
    super("test1", ModelTest.db());
  }
}
