package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareMap.HardwareUltimateGoal;

@TeleOp (name = "TeleopUltimateGoal")

public class TeleopUltimateGoal extends LinearOpMode {

    HardwareUltimateGoal Robot = new HardwareUltimateGoal();

    @Override
    public void runOpMode() throws InterruptedException {

        System.out.println("Starting up");
        telemetry.addData("init pressed", "about to initialize");
        telemetry.update();

        System.out.println("Initialize Robot");
        Robot.InitializeRobot(hardwareMap);
        System.out.println("Robot Initialized");

        telemetry.addData("Status", "Ready!");

        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            double fwdBack = gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;

            if (gamepad1.start) {

                Robot.leftFront.setPower((fwdBack + 1.5*strafe - turn) * .25);
                Robot.leftBack.setPower((fwdBack - 1.5*strafe - turn) * .25);
                Robot.rightFront.setPower((-fwdBack + 1.5*strafe - turn) * .25);
                Robot.rightBack.setPower((-fwdBack - 1.5*strafe - turn) * .25);

            } else { // drive robot normally at full speed

                Robot.leftFront.setPower((fwdBack + strafe - turn));
                Robot.leftBack.setPower((fwdBack - strafe - turn));
                Robot.rightFront.setPower((-fwdBack + strafe - turn));
                Robot.rightBack.setPower((-fwdBack - strafe - turn));

            }

            }

        if (gamepad2.right_bumper) {
            Robot.Outake(1);
        }
        else {
            Robot.Outake(0);
        }

        if (gamepad2.left_bumper) {
            Robot.Outake(-1);
        }
        else {
            Robot.Outake(0);
        }
        }


    }





