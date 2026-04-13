package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Omni Drive", group = "Linear OpMode")
public class movCompleta extends LinearOpMode {

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

        while (opModeIsActive()) {

            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            double fd = y - x - rx;
            double fe = y + x + rx;
            double td = y + x - rx;
            double te = y - x + rx;

            double max = Math.max(Math.abs(fd),
                    Math.max(Math.abs(fe),
                            Math.max(Math.abs(td), Math.abs(te))));

            if (max > 1.0) {
                fd /= max;
                fe /= max;
                td /= max;
                te /= max;
            }

            Frente_d.setPower(fd);
            Frente_e.setPower(fe);
            Tras_d.setPower(td);
            Tras_e.setPower(te);

            telemetry.addData("Frente Direita", fd);
            telemetry.addData("Frente Esquerda", fe);
            telemetry.addData("Tras Direita", td);
            telemetry.addData("Tras Esquerda", te);
            telemetry.update();
        }
    }
}