package frc.robot;
import edu.wpi.first.wpilibj.SPI;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public interface HardwareAdapter {

    public final CANSparkMax left1 = new CANSparkMax( 1, MotorType.kBrushless);
    public final CANSparkMax left2 = new CANSparkMax( 2, MotorType.kBrushless);
    public final CANSparkMax left3 = new CANSparkMax( 3, MotorType.kBrushless);
    public final CANSparkMax right1 = new CANSparkMax( 4, MotorType.kBrushless);
    public final CANSparkMax right2 = new CANSparkMax( 5, MotorType.kBrushless);
    public final CANSparkMax right3 = new CANSparkMax( 6, MotorType.kBrushless);
    public final MotorControllerGroup dtLeft = new MotorControllerGroup(left1, left2, left3);
    public final MotorControllerGroup dtRight = new MotorControllerGroup(right1, right2, right3);
    public final DifferentialDrive dt = new DifferentialDrive(dtLeft, dtRight);

    public final CANSparkMax flywheel7 = new CANSparkMax(7, MotorType.kBrushless);
    public final CANSparkMax flywheel8 = new CANSparkMax(8, MotorType.kBrushless);

    public final CANSparkMax intake9 = new CANSparkMax(9, MotorType.kBrushless);
    public final CANSparkMax intake10 = new CANSparkMax(10, MotorType.kBrushless);

    public final CANSparkMax sushiWheel11 = new CANSparkMax(11, MotorType.kBrushless);

    public final VictorSPX feeder12 = new VictorSPX(12);
    public final PowerDistribution pdp = new PowerDistribution();
    public final PneumaticsControlModule pcm = new PneumaticsControlModule();

    public static final AHRS navx = new AHRS(SPI.Port.kMXP);
    


}

