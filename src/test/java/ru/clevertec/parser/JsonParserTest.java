package ru.clevertec.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.clevertec.objectmother.ObjectMother;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class JsonParserTest {
    @InjectMocks
    private JsonParser parser;

    private static ObjectMapper objectMapper;

    @BeforeAll
    public static void init() {
        objectMapper = new ObjectMapper().findAndRegisterModules();
    }

    @Test
    @DisplayName("toJson: int[]")
    void testToJsonWithPrimitiveArray() throws JsonProcessingException {
        var argument = ObjectMother.getPrimitiveArray();
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: String[]")
    void testToJsonWithObjectArray() throws JsonProcessingException {
        var argument = ObjectMother.getObjectArray();
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: String[][]")
    void testToJsonWithTwoDimensionArray() throws JsonProcessingException {
        var argument = ObjectMother.getTwoDimensionArray();
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: String")
    void testToJsonWithString() throws JsonProcessingException {
        var argument = ObjectMother.getString();
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: with Object")
    void testToJsonWithObject() {
        var argument = ObjectMother.getObject();
        var expected = "{" +
                        "\"aString\":\"qwe\"," +
                        "\"oneDimensionArray\":" +
                            "[" +
                                "1," +
                                "2," +
                                "3" +
                            "]," +
                        "\"twoDimensionArray\":" +
                            "[" +
                                "[" +
                                    "\"a\"," +
                                    "\"b\"," +
                                    "\"c\"" +
                                "]," +
                                "[" +
                                    "\"d\"," +
                                    "\"e\"," +
                                    "\"f\"" +
                                "]" +
                            "]," +
                        "\"alist\":" +
                            "[" +
                                "\"hello\"," +
                                "\"world\"," +
                                "\"!\"" +
                            "]," +
                        "\"aBoolean\":true," +
                        "\"aDouble\":100.0," +
                        "\"aChar\":\"c\"," +
                        "\"anEnum\":\"FIRST\"," +
                        "\"aNull\":null," +
                        "\"innerObject\":" +
                            "{" +
                                "\"aString\":\"inner\"," +
                                "\"oneDimensionArray\":null," +
                                "\"twoDimensionArray\":null," +
                                "\"alist\":null," +
                                "\"aBoolean\":true," +
                                "\"aDouble\":6.8," +
                                "\"aChar\":\"j\"," +
                                "\"anEnum\":null," +
                                "\"aNull\":null," +
                                "\"innerObject\":null" +
                            "}" +
                        "}";
        //the fields in the object have different order after converting to json

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullSource
    @DisplayName("toJson: null")
    void testToJsonWithNull(Object argument) throws JsonProcessingException {
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: List<String>")
    void testToJsonWithCollection() throws JsonProcessingException {
        var argument = ObjectMother.getCollection();
        var expected = objectMapper.writeValueAsString(argument);

        var actual = parser.toJson(argument);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("toJson: Map<String, Integer>")
    void testToJsonWithMap() {
    }
}