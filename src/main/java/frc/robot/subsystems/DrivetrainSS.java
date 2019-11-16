/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DrivetrainSS extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static TalonSRX leftMotor1; 
  public static TalonSRX leftMotor2;
  public static TalonSRX rightMotor1;
  public static TalonSRX rightMotor2;

  public DrivetrainSS(){
    //constructor
    leftMotor1 = new TalonSRX(RobotMap.leftMotor1);
    leftMotor2 = new TalonSRX(RobotMap.leftMotor2);
    rightMotor1 = new TalonSRX(RobotMap.rightMotor1);
    rightMotor2 = new TalonSRX(RobotMap.rightMotor2);
  }

  public void ArcadeDrive() {
    
  }

  public void halt(){
    leftMotor1.set(ControlMode.PercentOutput, 0);
    leftMotor2.set(ControlMode.PercentOutput, 0);
    rightMotor1.set(ControlMode.PercentOutput, 0);
    rightMotor2.set(ControlMode.PercentOutput, 0);
  }
  
  public void move(){
    leftMotor1.set(ControlMode.PercentOutput, 1);
    leftMotor2.set(ControlMode.PercentOutput, 1);
    rightMotor1.set(ControlMode.PercentOutput, 1);
    rightMotor2.set(ControlMode.PercentOutput, 1);
  }

  public void set_speed(double leftspeed, double rightspeed){
    leftMotor1.set(ControlMode.PercentOutput, leftspeed);
    leftMotor2.set(ControlMode.PercentOutput, leftspeed);
    rightMotor1.set(ControlMode.PercentOutput, rightspeed);
    rightMotor2.set(ControlMode.PercentOutput, rightspeed);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
