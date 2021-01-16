package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

    public class HardwareUltimateGoal {

        //wheels
        public DcMotor leftFront;
        public DcMotor rightFront;
        public DcMotor leftBack;
        public DcMotor rightBack;

        //other motors
        public DcMotor rampLift;
        public DcMotor intakeMotor;

        //servos
        public Servo intakeFront;
        public Servo intakeBack;

        //hardware map
        public HardwareMap hardwareMap;

        public int driveTime;

        ElapsedTime driveTime = new ElapsedTime();

        HardwareMap HWMap = null;

//----------------------------------Methods-----------------------------------//

//init-gerty
        public void initializeRobot(HardwareMap hwMap) {

            HardwareMap HWMap = hwMap;

//initialize motors
            leftFront = hardwareMap.dcMotor.get("left_front");
            rightFront = hardwareMap.dcMotor.get("right_front");
            leftBack = hardwareMap.dcMotor.get("left_back");
            rightBack = hardwareMap.dcMotor.get("right_back");

            rampLift = hardwareMap.dcMotor.get("ramp_lift");
            intakeMotor = hardwareMap.dcMotor.get("intake_motor");

            intakeFront = hardwareMap.servo.get("intake_front");
            intakeBack = hardwareMap.servo.get("intake_back");

            intakeFront.setPosition(0);
            intakeBack.setPosition(0);

//drive-forward
    while double fwdback {
        leftFront.setPower(1);
        leftBack.setPower(1);
        rightFront.setPower(-1);
        rightBack.setPower(-1);
    }
    while double strafe {
        leftFront.setPower(-1);
        leftBack.setPower(1);
        rightFront.setPower(1);
        rightBack.setPower(-1);
    }






        }

    }






}
