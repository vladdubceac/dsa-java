package greedy_algorithms.activity_selection_problem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    static void activitySelection(List<Activity> activityList) {
        activityList.sort(Comparator.comparingInt(Activity::getFinishTime));
        Activity previousActivity = activityList.get(0);

        System.out.println("\nRecommended Schedule:\n" + activityList.get(0));

        for (int i = 1; i < activityList.size(); i++) {
            Activity activity = activityList.get(i);
            if (activity.getStartTime() >= previousActivity.getFinishTime()) {
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }
}
