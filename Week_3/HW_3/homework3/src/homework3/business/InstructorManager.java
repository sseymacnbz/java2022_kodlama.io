package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.InstructorDao;
import homework3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void addInstructor(Instructor instructor) {
		instructorDao.add();
		
		for(Logger logger : loggers) {
			logger.log();
		}
	}
}
