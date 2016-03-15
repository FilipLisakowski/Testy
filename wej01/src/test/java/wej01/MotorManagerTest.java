package wej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotorManagerTest {
	//under test
		MotorManager manager = new MotorManager();
		Motor moto1 = new Motor("Yamaha", "R1", "1000cm", "Black", 2010);
		Motor moto2 = new Motor("Suzuki", "GSXR600", "600cm", "Red", 2015);
		Motor moto3 = new Motor("Aprilia", "RSV1000", "1000cm", "White", 2000);

		
		@Test
		public void checkAdd(){
			assertEquals(0, manager.motoList.size());
			
			manager.add(moto1);
			assertEquals(1, manager.motoList.size());
			assertEquals("Yamaha", manager.motoList.get(0).brand);
			assertEquals("R1", manager.motoList.get(0).model);
			assertEquals("1000cm", manager.motoList.get(0).capacity);
			assertEquals("Black", manager.motoList.get(0).color);
			assertEquals(2010, manager.motoList.get(0).year);

			
			manager.add(moto2);
			assertEquals(2, manager.motoList.size());
			assertEquals("Suzuki", manager.motoList.get(1).brand);
			assertEquals("GSXR600", manager.motoList.get(1).model);
			assertEquals("600cm", manager.motoList.get(1).capacity);
			assertEquals("Red", manager.motoList.get(1).color);
			assertEquals(2015, manager.motoList.get(1).year);
			
			manager.add(moto3);
			assertEquals(3, manager.motoList.size());
			assertEquals("Aprilia", manager.motoList.get(2).brand);
			assertEquals("RSV1000", manager.motoList.get(2).model);
			assertEquals("1000cm", manager.motoList.get(2).capacity);
			assertEquals("White", manager.motoList.get(2).color);
			assertEquals(2000, manager.motoList.get(2).year);
		}
		
		@Test
		public void checkGetAll(){
			assertTrue(manager.getAll().isEmpty());
			
			manager.add(moto1);
			assertEquals(1, manager.motoList.size());
			assertNotNull(manager.getAll());

			
			manager.add(moto2);
			assertEquals(2, manager.motoList.size());
			assertNotNull(manager.getAll());


			manager.add(moto3);
			assertEquals(3, manager.motoList.size());
			assertNotNull(manager.getAll());

			assertFalse(manager.getAll().isEmpty());
		}
}
