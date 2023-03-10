package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class Controllers {
    
    private static Controllers thetrueControlSystem;
    Joystick manipulatorStick;
    public XboxController driverController;
    XboxController manipulatorController;
    XboxController climberController;

    public Controllers() {
        manipulatorController = new XboxController(2);
        driverController = new XboxController(0);
        climberController = new XboxController(4);
    }

    //Driver controller functions
    public double dGamepadLeftY() {
        return driverController.getRawAxis(1);
    }
    public double dGamepadRightY() {
        return driverController.getRawAxis(5);
    }
    public boolean dGamepadA() {
        return driverController.getRawButton(1);
    }
    public boolean dGamepadB() {
        return driverController.getRawButton(2);
    }
    public boolean dGamepadRightBumper() {
        return driverController.getRawButton(6);
    }
    public boolean dGamepadLeftBumper() {
        return driverController.getRawButton(5);
    }
    public double dGamepadLeftTrigger() {
        return driverController.getRawAxis(2);
    }
    public double dGamepadRightTrigger() {
        return driverController.getRawAxis(3);
    }
    public double mGamepadLeftY() {
        return manipulatorController.getRawAxis(1);
    }
    public double mGamepadRightY() {
        return manipulatorController.getRawAxis(5);
    }
    public boolean dGamepadBack() {
        return driverController.getRawButton(7);
    }
    public boolean dGamepadStart() {
        return driverController.getRawButton(8);
    }
    public String dGamepadPov() {
        if (driverController.getPOV() == 0) {
            return "up";
        } 
        if (driverController.getPOV() == 180) {
            return "down";
        }
        return "";
    }

    

    //Manipulator controller functions
    public boolean mGamepadA() {
        return manipulatorController.getRawButton(1);
    }
    public boolean mGamepadB() {
        return manipulatorController.getRawButton(2);
    }
    
    public boolean mGamepadX() {
        return manipulatorController.getRawButton(3);
    }
    public boolean mGamepadY() {
        return manipulatorController.getRawButton(4);
    }
    
    public boolean mGamepadRightBumper() {
        return manipulatorController.getRawButton(6);
    }
    public boolean mGamepadLeftBumper() {
        return manipulatorController.getRawButton(5);
    }
    
    public boolean mGamepadStart() {
        return manipulatorController.getRawButton(8);
    }
    public double mGamepadLeftTrigger() {
        return manipulatorController.getRawAxis(2);
    }
    public double mGamepadRightTrigger() {
        return manipulatorController.getRawAxis(3);
    }
    public String mGamepadPov() {
        if (manipulatorController.getPOV() == 0) {
            return "up";
        } 
        if (manipulatorController.getPOV() == 180) {
            return "down";
        }
        return "";
    } 


    //Climber controller functions
    public String cGamepadPov() {
        if (climberController.getPOV() == 0) {
            return "up";
        } 
        if (climberController.getPOV() == 180) {
            return "down";
        }
        return "";
    }
    public double cGamepadLeftY() {
        return climberController.getRawAxis(1);
    }
    public double cGamepadRightY() {
        return climberController.getRawAxis(5);
    }
    public boolean cGamepadA() {
        return climberController.getRawButton(1);
    }
    public boolean cGamepadB() {
        return climberController.getRawButton(2);
    }
    public boolean cGamepadX() {
        return climberController.getRawButton(3);
    }
    public boolean cGamepadY() {
        return climberController.getRawButton(4);
    }

    public static Controllers get() {
        if (thetrueControlSystem != null) return thetrueControlSystem;

        thetrueControlSystem = new Controllers();
        return thetrueControlSystem;
    }
}