package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("Workintech", "dummy desc 1", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("Workintech", "dummy desc 2", "ann", Status.IN_PROGRESS, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("Workintech", "dummy desc ", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task taskBob2 = new Task("Workintech", "dummy desc 2", "bob", Status.IN_PROGRESS, Priority.HIGH);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task carolsTask = new Task("Workintech", "dummy desc 4", "carrol", Status.IN_QUEUE, Priority.MED);
        Task carolsTask2 = new Task("Workintech", "dummy desc 3", "carrol", Status.IN_PROGRESS, Priority.HIGH);

        carolsTasks.add(carolsTask);
        carolsTasks.add(carolsTask2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task taskUnassigned = new Task("Workintech", "dummy desc 6", "null", Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(taskUnassigned);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("bobstasks: " + taskData.getTasks("bob"));
        System.out.println("annstasks: " + taskData.getTasks("ann"));
        System.out.println("alltasks: " + taskData.getTasks("all"));
        taskData.getIntersection(annsTasks, bobsTasks);
        taskData.getIntersection(annsTasks, carolsTasks);
        taskData.getIntersection(bobsTasks, carolsTasks);

        System.out.println("unnassigned: " + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));

        System.out.println("---------------------------------------------------------------------");

        StringSet.findUniqueWords();


    }
}