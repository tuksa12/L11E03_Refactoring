package de.tum.in.ase.eist;


public class TutorGroupMeeting {

    private static final int NUMBER_OF_HOMEWORK_PRESENTATIONS = 3;
    private final TimeSlot timeSlot;
    private final TutorGroup tutorGroup;
    private Skill skillToPractice;


    public TutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
        this.timeSlot = timeSlot;
        this.tutorGroup = tutorGroup;
        this.skillToPractice = skillToPractice;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }

    public Skill getSkillToPractice() {
        return skillToPractice;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
}
