package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareMap.HardwareUltimateGoal;

@Autonomous (name = "AutoRed2")
//delivering left wobble goal to closest square
public class AutoRed2 extends LinearOpMode {
    HardwareUltimateGoal Robot = new HardwareUltimateGoal();

    @Override
    public void runOpMode() throws InterruptedException {

        //strafe right just a little bit

        Robot.DriveSideways(.5,1000,1,1,1,1);
        Thread.sleep(1000);

        //drive straight and stop on line

        Robot.DriveStraight(1,5000,1);
        Thread.sleep(5000);


    }
}
