package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareMap.HardwareUltimateGoal;
//right wobble second square

@Autonomous (name = "AutoRed4")
public class AutoRed4 extends LinearOpMode {
    HardwareUltimateGoal Robot = new HardwareUltimateGoal();

    @Override
    public void runOpMode() throws InterruptedException {

        Robot.DriveStraight(1,3500,1);
        Thread.sleep(1000);

//strafe left
        Robot.DriveSideways(.5,3000,1,1,1,1);
        Thread.sleep(3000);

        Robot.DriveStraight(.5,3000,1);
        Thread.sleep(1000);

        Robot.DriveStraight(.5,1000,-1);
        Thread.sleep(1000);
    }
}
