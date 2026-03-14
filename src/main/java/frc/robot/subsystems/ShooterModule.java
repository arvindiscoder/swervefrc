package frc.robot.subsystems;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class ShooterModule {
    private final SparkFlex m_shooter1;
    private final SparkFlex m_shooter2;

    public ShooterModule(int shooter1CanId, int shooter2CanId, boolean inverted) {
        m_shooter1 = new SparkFlex(shooter1CanId, MotorType.kBrushless);
        m_shooter2 = new SparkFlex(shooter2CanId, MotorType.kBrushless);
        m_shooter2.setInverted(inverted);
        m_shooter2.setInverted(!inverted);
    }

    public ShooterModule(int intake1CanId, int intake2CanId) {
        this(intake1CanId, intake2CanId, false);
    }

    public void setSpeed(double speed) {
        m_shooter1.set(speed);
        m_shooter2.set(speed);
    }

    // public double getRPM() {
    //     RelativeEncoder shooterEncoder = m_intake1.getEncoder();
    //     return shooterEncoder.getVelocity() * 30.0 / 16.0 * 60;
    // }
}