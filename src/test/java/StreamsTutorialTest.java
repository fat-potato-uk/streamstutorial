import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamsTutorialTest {

    // Change StreamsChallenge to StreamsChallengeAnswers to see proof this works :)
    private StreamsTutorial streamsTutorial = new StreamsChallenge();

    @Test
    void filterByStartingWithA() {
        assertThat(streamsTutorial.filterByStartingWithA(), containsInAnyOrder("aaa2", "aaa1"));
    }

    @Test
    void filterByStartingWithASorted() {
        assertThat(streamsTutorial.filterByStartingWithASorted(), contains("aaa1", "aaa2"));
    }

    @Test
    void changeToUpperCaseAndReverseOrder() {
        assertThat(streamsTutorial.changeToUpperCaseAndReverseOrder(), contains("DDD2", "DDD1", "CCC", "BBB3", "BBB2", "BBB1", "AAA2", "AAA1"));
    }

    @Test
    void concatenateToSingleHashDelimitedString() {
        assertEquals("aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2", streamsTutorial.concatenateToSingleHashDelimitedString());
    }

    @Test
    void mapOfNamesToSalary() {
        assertEquals( Map.of("Bob", 1000,"Sally", 2000,"Eve", 1050), streamsTutorial.mapOfNamesToSalary());
    }

    @Test
    void peopleWithThreeLetterNames() {
        assertEquals(2, streamsTutorial.peopleWithThreeLetterNames());
    }

    @Test
    void totalSalaryCost() {
        assertEquals(4050, streamsTutorial.totalSalaryCost());
    }

    @Test
    void returnListOfPeopleFromPartialPersonListWithUnknownReplacedByDave() {
        assertThat(streamsTutorial.returnListOfPeopleFromPartialPersonListWithUnknownReplacedByDave(), contains("Dave", "Sally", "Dave"));
    }

    @Test
    void giveEveryoneAThousandPoundPayrise() {
        streamsTutorial.giveEveryoneAThousandPoundPayRise();
        assertEquals(streamsTutorial.mapOfNamesToSalary(), Map.of("Bob", 2000,"Sally", 3000,"Eve", 2050));
    }

    @Test
    void splitStringToCollection() {
        assertEquals(List.of("a","b","c","d","e","f"), (streamsTutorial.splitStringToCollection("a,b,c,d,e,f", ",")));
    }
}