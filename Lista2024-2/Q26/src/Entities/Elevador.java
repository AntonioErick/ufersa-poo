package Entities;

public class Elevador {

	private int ActualFloor;
	private int TotalFloor;
	private int ElevatorCapacity;
	private int ElevatorPeopleNow;
	
	public Elevador(int ElevatorCapacity, int TotalFloor) {
		this.ElevatorCapacity = ElevatorCapacity;
		this.TotalFloor = TotalFloor;
		this.ActualFloor = 0;
		this.ElevatorPeopleNow = 0;
	}

	public int getActualFloor() {
		return ActualFloor;
	}

	public int getTotalFloor() {
		return TotalFloor;
	}

	public int getElevatorCapacity() {
		return ElevatorCapacity;
	}

	public int getElevatorPeopleNow() {
		return ElevatorPeopleNow;
	}

	public void setElevatorPeopleNow(int elevatorPeopleNow) {
		ElevatorPeopleNow = elevatorPeopleNow;
	}
	
	public void Enter() {
		if(ElevatorPeopleNow < ElevatorCapacity) {
			ElevatorPeopleNow++;
			System.out.println("One person entered. Total people now: "+ElevatorPeopleNow);
		}
		else {
			System.out.println("Elevator is already full");
		}
	}
	
	
	public void Leave() {
		if(ElevatorPeopleNow > 0) {
			ElevatorPeopleNow--;
			System.out.println("People in the elevator now: "+ElevatorPeopleNow);
		}
		else {
			System.out.println("Elevator is empty.");
		}
	}
	
	
	public void UpFloor() {
		if(ActualFloor < TotalFloor) {
			ActualFloor++;
			System.out.println("Actual floor: "+ActualFloor);
		}
		else {
			System.out.println("You're already at the top.");
		}
	}
	
	
	public void DownFloor() {
		if(ActualFloor > 0) {
			ActualFloor--;
			System.out.println("Actual floor: "+ActualFloor);
		}
		else {
			System.out.println("You're already at the ground floor.");
		}
	}
}
