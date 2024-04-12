package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

public class IdleIntake extends Command {

    private final Intake _intake;
    public IdleIntake(Intake intake){
      _intake = intake;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        _intake.setIntakeSpeed(0);
    }
    
}
