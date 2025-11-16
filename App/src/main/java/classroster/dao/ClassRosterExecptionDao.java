package classroster.dao;

public class ClassRosterExecptionDao extends Exception{

    public ClassRosterExecptionDao(String message) {
        super(message);
    }

    public ClassRosterExecptionDao(String message, Throwable cause) {
        super(message, cause);
    }

}
