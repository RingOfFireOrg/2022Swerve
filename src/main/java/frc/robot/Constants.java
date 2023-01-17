package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.PS4Controller.Button;
import java.lang.Math;


public final class Constants {

    public static final class ModuleConstants {

        public static final double kEncoderCPR = 2048;

        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        public static final double kDriveMotorGearRatio = 1 / 6.75; //L1
        public static final double kTurningMotorGearRatio = 1 / (150/7);
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = 0.5;
        
    }

    public static final class DriveConstants {

        public static final double kTrackWidth = 0.6; //meters //Units.inchesToMeters(21);
        // Distance between right and left wheels
        public static final double kWheelBase = 0.6;//meters //Units.inchesToMeters(25.5);
        // Distance between front and back wheels
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        // CANSPARKMAX0 = leftFrontTurn
        // CANSPARKMAX2 = rightFrontTurn
        // CANSPARKMAX4 = leftBackTurn
        // CANSPARKMAX6 = rightBackTurn

        // CANSPARKMAX1 = leftFrontDrive
        // CANSPARKMAX3 = rightFrontDrive
        // CANSPARKMAX5 = leftBackDrive
        // CANSPARKMAX7 = rightBackDrive



        public static final int CardinalDirection = 0;

        public static final int kFrontLeftDriveMotorPort = 8;
        public static final int kBackLeftDriveMotorPort = 4;
        public static final int kFrontRightDriveMotorPort = 2;
        public static final int kBackRightDriveMotorPort = 6;

        public static final int kFrontLeftTurningMotorPort = 1;
        public static final int kBackLeftTurningMotorPort = 5;
        public static final int kFrontRightTurningMotorPort = 3;
        public static final int kBackRightTurningMotorPort = 7;

        public static final boolean kFrontLeftTurningEncoderReversed = false;
        public static final boolean kBackLeftTurningEncoderReversed = false;
        public static final boolean kFrontRightTurningEncoderReversed = false;
        public static final boolean kBackRightTurningEncoderReversed = false;

        public static final boolean kFrontLeftDriveEncoderReversed = false;
        public static final boolean kBackLeftDriveEncoderReversed = true;
        public static final boolean kFrontRightDriveEncoderReversed = true;
        public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 9;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 10;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 11;
        public static final int kBackRightDriveAbsoluteEncoderPort = 12;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = true;

        // public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = (0); //offset in radians
        // public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = (-6.264765 + Math.PI/2 + Math.PI/18); //offset in radians
        // public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = (Math.PI/4 - Math.PI/12); //offset in radians
        // public static final double kBackRightDriveAbsoluteEncoderOffsetRad = (3.136984 - Math.PI/9); //offset in radians

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = (CardinalDirection+3.216752-0.088-.059); //STRAIGHT DONT EDIT 
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = (CardinalDirection-2.775+0.9+.117); //offsetxzs in radians
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = (CardinalDirection+1.146-.137); //offset in radians
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = (CardinalDirection-4.8225-1.1); //offset in radians

        public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;
        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 2.5; //change denomenator
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 4; //change denomenator
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;
    }

        public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
                DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5; //multiplier for controller PID control
        public static final double kPYController = 1.5; //multiplier for controller PID control
        public static final double kPThetaController = 3; //multiplier for controller PID control

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 6;
        public static final int kAlignWithTargetButton = 5;
        public static final int kResetDirectionButton = 4;

        public static final double kDeadband = 0.05;
    }
}