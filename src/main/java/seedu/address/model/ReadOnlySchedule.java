package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.lessons.Lesson;

/**
 * Unmodifiable view of a Schedule
 */
public interface ReadOnlySchedule {

    /**
     * Returns an unmodifiable view of the lessons list.
     * This list will not contain any duplicate lessons.
     */
    ObservableList<Lesson> getLessonList();

}
