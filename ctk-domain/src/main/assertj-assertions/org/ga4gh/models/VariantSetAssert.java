package org.ga4gh.models;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link VariantSet} specific assertions - Generated by CustomAssertionGenerator.
 */
public class VariantSetAssert extends AbstractAssert<VariantSetAssert, VariantSet> {

  /**
   * Creates a new <code>{@link VariantSetAssert}</code> to make assertions on actual VariantSet.
   * @param actual the VariantSet we want to make assertions on.
   */
  public VariantSetAssert(VariantSet actual) {
    super(actual, VariantSetAssert.class);
  }

  /**
   * An entry point for VariantSetAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myVariantSet)</code> and get specific assertion with code completion.
   * @param actual the VariantSet we want to make assertions on.
   * @return a new <code>{@link VariantSetAssert}</code>
   */
  public static VariantSetAssert assertThat(VariantSet actual) {
    return new VariantSetAssert(actual);
  }

  /**
   * Verifies that the actual VariantSet's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual VariantSet's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual VariantSet's classSchema is not equal to the given one.
   */
  public VariantSetAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting classSchema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualClassSchema = actual.getClassSchema();
    if (!Objects.areEqual(actualClassSchema, classSchema)) {
      failWithMessage(assertjErrorMessage, actual, classSchema, actualClassSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's datasetId is equal to the given one.
   * @param datasetId the given datasetId to compare the actual VariantSet's datasetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual VariantSet's datasetId is not equal to the given one.
   */
  public VariantSetAssert hasDatasetId(String datasetId) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting datasetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualDatasetId = actual.getDatasetId();
    if (!Objects.areEqual(actualDatasetId, datasetId)) {
      failWithMessage(assertjErrorMessage, actual, datasetId, actualDatasetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's id is equal to the given one.
   * @param id the given id to compare the actual VariantSet's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual VariantSet's id is not equal to the given one.
   */
  public VariantSetAssert hasId(String id) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's metadata contains the given VariantSetMetadata elements.
   * @param metadata the given elements that should be contained in actual VariantSet's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual VariantSet's metadata does not contain all given VariantSetMetadata elements.
   */
  public VariantSetAssert hasMetadata(VariantSetMetadata... metadata) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // check that given VariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's metadata contains <b>only<b> the given VariantSetMetadata elements and nothing else in whatever order.
   * @param metadata the given elements that should be contained in actual VariantSet's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual VariantSet's metadata does not contain all given VariantSetMetadata elements.
   */
  public VariantSetAssert hasOnlyMetadata(VariantSetMetadata... metadata) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // check that given VariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's metadata does not contain the given VariantSetMetadata elements.
   *
   * @param metadata the given elements that should not be in actual VariantSet's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual VariantSet's metadata contains any given VariantSetMetadata elements.
   */
  public VariantSetAssert doesNotHaveMetadata(VariantSetMetadata... metadata) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // check that given VariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet has no metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual VariantSet's metadata is not empty.
   */
  public VariantSetAssert hasNoMetadata() {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have metadata but had :\n  <%s>";
    
    // check
    if (actual.getMetadata().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getMetadata());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual VariantSet's referenceSetId is equal to the given one.
   * @param referenceSetId the given referenceSetId to compare the actual VariantSet's referenceSetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual VariantSet's referenceSetId is not equal to the given one.
   */
  public VariantSetAssert hasReferenceSetId(String referenceSetId) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting referenceSetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualReferenceSetId = actual.getReferenceSetId();
    if (!Objects.areEqual(actualReferenceSetId, referenceSetId)) {
      failWithMessage(assertjErrorMessage, actual, referenceSetId, actualReferenceSetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual VariantSet's schema is equal to the given one.
   * @param schema the given schema to compare the actual VariantSet's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual VariantSet's schema is not equal to the given one.
   */
  public VariantSetAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual VariantSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting schema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualSchema = actual.getSchema();
    if (!Objects.areEqual(actualSchema, schema)) {
      failWithMessage(assertjErrorMessage, actual, schema, actualSchema);
    }

    // return the current assertion for method chaining
    return this;
  }





}
