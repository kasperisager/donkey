package donkey.fixture;

import java.util.List;

import donkey.Model;
import donkey.ModelTest;

/**
 * Concrete model class for testing.
 */
public class ConcreteModel1 extends Model {
  /**
   * Float field (wrapped).
   */
  public Float floatWrapped;

  /**
   * Float field (primitive).
   */
  public float floatPrimitive;

  /**
   * Long field (wrapped).
   */
  public Long longWrapped;

  /**
   * Long field (primitive).
   */
  public long longPrimitive;

  /**
   * Boolean field (wrapped).
   */
  public Boolean booleanWrapped;

  /**
   * Boolean field (primitive).
   */
  public boolean booleanPrimitive;

  /**
   * List of model subclasses.
   */
  public List<ConcreteModel2> models;

  /**
   * Initialize a model.
   */
  public ConcreteModel1() {
    super("test2", ModelTest.db());
  }
}
