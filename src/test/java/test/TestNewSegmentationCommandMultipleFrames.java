package test;

import de.embl.cba.microglia.command.MicrogliaSegmentationAndTrackingCommand;
import net.imagej.ImageJ;
import org.junit.jupiter.api.Test;

import java.io.File;

public class TestNewSegmentationCommandMultipleFrames
{
    @Test
	public void run()
	{
		final ImageJ ij = new ImageJ();

		final MicrogliaSegmentationAndTrackingCommand command = new MicrogliaSegmentationAndTrackingCommand();
		command.opService = ij.op();
		command.intensityFile = new File("src/test/resources/data/MAX_pg6-3CF1_20--t1-3.tif");
		command.outputDirectory = new File( "src/test/resources/tmp-data" );
		command.relativeIntensityThreshold = 1.5;
		command.minimalMicrogliaSize = 200; // area in um
		command.skeletonMaxLength = 200; // length in um
		command.contactMaxLength = 35; // length in um
		command.headless = true;
		command.run();
	}
}
