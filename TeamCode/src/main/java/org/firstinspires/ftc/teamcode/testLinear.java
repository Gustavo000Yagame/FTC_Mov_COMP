package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.onbotjava.handlers.objbuild.WaitForBuild;


@TeleOp(name="Basic: Omni Linear OpMode", group="Linear OpMode")
public class testLinear extends LinearOpMode {


    DcMotor Frente_d;
    DcMotor Frente_e;
    DcMotor Tras_d;
    DcMotor Tras_e;


    @Override
    public void runOpMode() {


    Frente_d = hardwareMap.dcMotor.get("FRENTE_DIREITA");

    Frente_e = hardwareMap.dcMotor.get("FRENTE_ESQUERDA");

    Tras_d = hardwareMap.dcMotor.get("TRAS_DIREITA");

    Tras_e = hardwareMap.dcMotor.get("TRAS_ESQUERDA");

    Frente_e.setDirection(DcMotorSimple.Direction.REVERSE);
    Tras_e.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();

        Frente_d.setPower(0.6);
        Frente_e.setPower(0.6);
        Tras_d.setPower(0.6);
        Tras_e.setPower(0.6);

        sleep(2000);

        Frente_d.setPower(0);
        Frente_e.setPower(0);
        Tras_d.setPower(0);
        Tras_e.setPower(0);
    }
}
