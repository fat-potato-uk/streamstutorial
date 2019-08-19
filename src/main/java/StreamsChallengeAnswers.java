import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

class StreamsChallengeAnswers extends StreamsTutorial {

    @Override
    List<String> filterByStartingWithA() {
        return this.getStringList()
                .stream()
                .filter(s -> s.startsWith("a"))
                .collect(toList());
    }

    @Override
    List<String> filterByStartingWithASorted() {
        return this.getStringList()
                .stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .collect(toList());
    }

    @Override
    List<String> changeToUpperCaseAndReverseOrder() {
        return this.getStringList()
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    @Override
    String concatenateToSingleHashDelimitedString() {
        return this.getStringList()
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2)
                        .orElseThrow();
    }

    @Override
    Map<String, Integer> mapOfNamesToSalary() {
        return this.getPersonList()
                .stream()
                .collect(toMap(Person::getName, Person::getSalary));
    }

    @Override
    int totalSalaryCost() {
        return this.getPersonList()
                .stream()
                .mapToInt(Person::getSalary)
                .sum();
    }

    @Override
    long peopleWithThreeLetterNames() {
        return this.getPersonList().stream().filter(person -> person.getName().length() == 3).count();
    }

    @Override
    void giveEveryoneAThousandPoundPayRise() {
        this.getPersonList().forEach(person -> person.setSalary(person.getSalary() + 1000));
    }

    @Override
    List<String> returnListOfPeopleFromPartialPersonListWithUnknownReplacedByDave() {
        return this.getPartialPersonList()
                .stream()
                .map(person -> Optional.ofNullable(person.getName()).orElse("Dave"))
                .collect(toList());
    }

    @Override
    List<String> splitStringToCollection(String inputString, String separator) {
        return Pattern.compile(separator)
                .splitAsStream(inputString)
                .collect(toList());
    }
}
