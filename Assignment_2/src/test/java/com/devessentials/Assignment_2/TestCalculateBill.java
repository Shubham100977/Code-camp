package com.devessentials.Assignment_2;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestCalculateBill {
	Customer customerA;

	@Before
	public void setup() {
		customerA = new Customer();
		customerA.setName("Shubham");
		List<Item> listOfItems = new ArrayList<Item>();
		Item i1 = Mockito.mock(Item.class);
		Item i2 = Mockito.mock(Item.class);
		Item i3 = Mockito.mock(Item.class);
		listOfItems.add(i1);
		listOfItems.add(i2);
		listOfItems.add(i3);

		customerA.setListOfItems(listOfItems);
		when(i1.getName()).thenReturn("Sugar");
		when(i2.getName()).thenReturn("Tea");
		when(i3.getName()).thenReturn("milk");
		when(i1.getPrice("Sugar")).thenReturn(100);
		when(i2.getPrice("Tea")).thenReturn(100);
		when(i3.getPrice("milk")).thenReturn(200);

	}

	@Test
	public void test_Customer_CalculateBill() {
		int billAmount = customerA.calculateBill();
		Assert.assertEquals(400, billAmount);
	}
}


