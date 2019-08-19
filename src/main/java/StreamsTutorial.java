import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

@Data
abstract class StreamsTutorial {

    @Data
    @AllArgsConstructor
    class Person {
        private String name;
        private int salary;
    }

    private final List<String> stringList;

    private final List<Person> personList;

    private final List<Person> partialPersonList;

    StreamsTutorial() {
        stringList        = List.of("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");
        personList        = List.of(new Person("Bob", 1000), new Person("Sally", 2000), new Person("Eve", 1050));
        partialPersonList = List.of(new Person(null, 1000), new Person("Sally", 2000), new Person(null, 1050));
    }

    // =============== String challenges =============== //
    
    abstract List<String> filterByStartingWithA();

    abstract List<String> filterByStartingWithASorted();

    abstract List<String> changeToUpperCaseAndReverseOrder();

    abstract String concatenateToSingleHashDelimitedString();

    // =============== Person challenges =============== //

    abstract Map<String, Integer> mapOfNamesToSalary();

    abstract int totalSalaryCost();

    abstract long peopleWithThreeLetterNames();

    abstract void giveEveryoneAThousandPoundPayRise();

    abstract List<String> returnListOfPeopleFromPartialPersonListWithUnknownReplacedByDave();

    // =============== Additional challenges =============== //

    abstract List<String> splitStringToCollection(String inputString, String separator);

}
