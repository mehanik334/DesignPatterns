package ua.epam.javacore.facade;

public class StudyingProccess {
    Student student = new Student();
    Knowledge knowledge = new Knowledge();
    Tracker tracker = new Tracker();

    public void studyKnowledge() {
        knowledge.learnKnowledge();
        tracker.startBusyTime();
        student.learnKnowledgeBeforeExam(tracker);
    }
}
