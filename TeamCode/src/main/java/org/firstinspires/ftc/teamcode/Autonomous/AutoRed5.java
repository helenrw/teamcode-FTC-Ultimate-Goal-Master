package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareMap.HardwareUltimateGoal;
//right wobble third square
@Autonomous (name = "AutoRed5")
public class AutoRed5 extends LinearOpMode {
    HardwareUltimateGoal Robot =  new HardwareUltimateGoal();
    @Override
    public void runOpMode() throws InterruptedException {
        //strafe right
        Robot.DriveSideways(.5,1000,1,1,1,1);
        Thread.sleep(1000);

        Robot.DriveStraight(1,5000,1);
        Thread.sleep(5000);

        Robot.DriveStraight(1,2000,-1);
        Thread.sleep(2000);


    }
}
