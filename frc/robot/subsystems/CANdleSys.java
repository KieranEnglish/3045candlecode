
package frc.robot.subsystems;

import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CANdleConstants;

public class CANdleSys extends SubsystemBase {

    private CANdle candle;

    public CANdleSys() {
        
        System.out.println("CANdle init");

        candle = new CANdle(CANdleConstants.CANdleport);

        configAll.vBatOutputMode = VBatOutputMode.Modulated;
        configAll.stripType = LEDStripType.RGB;

        System.out.println("CANdle init end");
    }

    public void setColorAll(int[] rgb) {
        candle.setLEDs(rgb[0],rgb[1],rgb[2]);
        candle.modulateVBatOutput(0.9);
    }

    public void setLEDOff() {
        candle.setLEDs(0, 0, 0);
        candle.modulateVBatOutput(0);
      }
}

