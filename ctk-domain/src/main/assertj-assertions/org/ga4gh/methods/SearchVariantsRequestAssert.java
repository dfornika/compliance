package org.ga4gh.methods;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link SearchVariantsRequest} specific assertions - Generated by CustomAssertionGenerator.
 */
public class SearchVariantsRequestAssert extends AbstractAssert<SearchVariantsRequestAssert, SearchVariantsRequest> {

  /**
   * Creates a new <code>{@link SearchVariantsRequestAssert}</code> to make assertions on actual SearchVariantsRequest.
   * @param actual the SearchVariantsRequest we want to make assertions on.
   */
  public SearchVariantsRequestAssert(SearchVariantsRequest actual) {
    super(actual, SearchVariantsRequestAssert.class);
  }

  /**
   * An entry point for SearchVariantsRequestAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(mySearchVariantsRequest)</code> and get specific assertion with code completion.
   * @param actual the SearchVariantsRequest we want to make assertions on.
   * @return a new <code>{@link SearchVariantsRequestAssert}</code>
   */
  public static SearchVariantsRequestAssert assertThat(SearchVariantsRequest actual) {
    return new SearchVariantsRequestAssert(actual);
  }

  /**
   * Verifies that the actual SearchVariantsRequest's callSetIds contains the given String elements.
   * @param callSetIds the given elements that should be contained in actual SearchVariantsRequest's callSetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchVariantsRequest's callSetIds does not contain all given String elements.
   */
  public SearchVariantsRequestAssert hasCallSetIds(String... callSetIds) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (callSetIds == null) failWithMessage("Expecting callSetIds parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getCallSetIds(), callSetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's callSetIds contains <b>only<b> the given String elements and nothing else in whatever order.
   * @param callSetIds the given elements that should be contained in actual SearchVariantsRequest's callSetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchVariantsRequest's callSetIds does not contain all given String elements.
   */
  public SearchVariantsRequestAssert hasOnlyCallSetIds(String... callSetIds) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (callSetIds == null) failWithMessage("Expecting callSetIds parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getCallSetIds(), callSetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's callSetIds does not contain the given String elements.
   *
   * @param callSetIds the given elements that should not be in actual SearchVariantsRequest's callSetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchVariantsRequest's callSetIds contains any given String elements.
   */
  public SearchVariantsRequestAssert doesNotHaveCallSetIds(String... callSetIds) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (callSetIds == null) failWithMessage("Expecting callSetIds parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getCallSetIds(), callSetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest has no callSetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchVariantsRequest's callSetIds is not empty.
   */
  public SearchVariantsRequestAssert hasNoCallSetIds() {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have callSetIds but had :\n  <%s>";
    
    // check
    if (actual.getCallSetIds().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getCallSetIds());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SearchVariantsRequest's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual SearchVariantsRequest's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's classSchema is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
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
   * Verifies that the actual SearchVariantsRequest's end is equal to the given one.
   * @param end the given end to compare the actual SearchVariantsRequest's end to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's end is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasEnd(Long end) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting end of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualEnd = actual.getEnd();
    if (!Objects.areEqual(actualEnd, end)) {
      failWithMessage(assertjErrorMessage, actual, end, actualEnd);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's pageSize is equal to the given one.
   * @param pageSize the given pageSize to compare the actual SearchVariantsRequest's pageSize to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's pageSize is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasPageSize(Integer pageSize) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageSize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Integer actualPageSize = actual.getPageSize();
    if (!Objects.areEqual(actualPageSize, pageSize)) {
      failWithMessage(assertjErrorMessage, actual, pageSize, actualPageSize);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's pageToken is equal to the given one.
   * @param pageToken the given pageToken to compare the actual SearchVariantsRequest's pageToken to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's pageToken is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasPageToken(String pageToken) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageToken of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualPageToken = actual.getPageToken();
    if (!Objects.areEqual(actualPageToken, pageToken)) {
      failWithMessage(assertjErrorMessage, actual, pageToken, actualPageToken);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's referenceName is equal to the given one.
   * @param referenceName the given referenceName to compare the actual SearchVariantsRequest's referenceName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's referenceName is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasReferenceName(String referenceName) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting referenceName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualReferenceName = actual.getReferenceName();
    if (!Objects.areEqual(actualReferenceName, referenceName)) {
      failWithMessage(assertjErrorMessage, actual, referenceName, actualReferenceName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's schema is equal to the given one.
   * @param schema the given schema to compare the actual SearchVariantsRequest's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's schema is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
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

  /**
   * Verifies that the actual SearchVariantsRequest's start is equal to the given one.
   * @param start the given start to compare the actual SearchVariantsRequest's start to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's start is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasStart(Long start) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting start of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualStart = actual.getStart();
    if (!Objects.areEqual(actualStart, start)) {
      failWithMessage(assertjErrorMessage, actual, start, actualStart);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's variantName is equal to the given one.
   * @param variantName the given variantName to compare the actual SearchVariantsRequest's variantName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's variantName is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasVariantName(String variantName) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting variantName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualVariantName = actual.getVariantName();
    if (!Objects.areEqual(actualVariantName, variantName)) {
      failWithMessage(assertjErrorMessage, actual, variantName, actualVariantName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchVariantsRequest's variantSetId is equal to the given one.
   * @param variantSetId the given variantSetId to compare the actual SearchVariantsRequest's variantSetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchVariantsRequest's variantSetId is not equal to the given one.
   */
  public SearchVariantsRequestAssert hasVariantSetId(String variantSetId) {
    // check that actual SearchVariantsRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting variantSetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualVariantSetId = actual.getVariantSetId();
    if (!Objects.areEqual(actualVariantSetId, variantSetId)) {
      failWithMessage(assertjErrorMessage, actual, variantSetId, actualVariantSetId);
    }

    // return the current assertion for method chaining
    return this;
  }









}
