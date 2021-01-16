package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.robot.Robot;

    @TeleOp(name = "TeleOpUltimateGoal", group = "Linear Opmode")
    public class TeleOpUltimateGoal extends LinearOpMode {

        HardwareUltimateGoal Gerty = new HardwareUltimateGoal();

        double rampLift;

        @Override
        public void init() {
        //telemetry
            System.out.println("Starting up");
            telemetry.addData("init pressed", "about to initialize");
            telemetry.update();

            System.out.println("Initialize Robot");
            Robot.InitializeRobot(hardwareMap);
            System.out.println("Robot Initialized");

            telemetry.addData("Status", "Ready!");

            telemetry.update();

            waitForStart();

            /*while (opModeIsActive()) {
                double fwdBack = -gamepad1.right_stick_y;
                double strafe = -gamepad1.right_stick_x;
                double turn = -gamepad1.left_stick_x;*/
        @Override
        public void loop() {

            double fwdBack = -gamepad1.right_stick_y;
            double strafe = -gamepad1.right_stick_x;
            double turn = -gamepad1.left_stick_x;

            //code for the motor that controls the ramp
            double rampLiftPower = gamepad2.left_stick_y;
            rampLift.setPower(rampLiftPower);
        }
    }

}
