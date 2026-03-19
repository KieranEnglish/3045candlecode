
package frc.robot.subsystems;


import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CANdleConstants;

public class CANdleSys extends SubsystemBase {

    private final CANdle candle;

    // find if hood angle is correct and find if drum is fully up to speed
    

    public CANdleSys() {
        
        System.out.println("CANdle init");

        candle = new CANdle(CANdleConstants.CANdleport);

        CANdleConfiguration configAll = new CANdleConfiguration();
        configAll.statusLedOffWhenActive = false;
        configAll.disableWhenLOS = false;
        configAll.stripType = LEDStripType.RGB;
        configAll.brightnessScalar = 0.1;
        configAll.vBatOutputMode = VBatOutputMode.Modulated;
        candle.configAllSettings(configAll, 100);
    

        System.out.println("CANdle init end");
    }

    public void setColorGrn(int[] rgb) {
        candle.setLEDs(10,165,35);
        candle.modulateVBatOutput(0.9);
    }

    public void setColorRed(int[] rgb) {
        candle.setLEDs(200,20,20);
        candle.modulateVbatOutput(0.9);
    }

    public void setLEDOff(int[] rgb) {
        candle.setLEDs(0, 0, 0);
        candle.modulateVBatOutput(0);
      }


    public void fireCheck() {
        if (inPos = true && speedSet = true) {
            setColorRed(rgb);
        } else {
            setColorGrn(rgb);
        }



    }

}