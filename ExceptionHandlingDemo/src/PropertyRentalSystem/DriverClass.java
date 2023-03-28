package PropertyRentalSystem;

import java.time.LocalDate;

public class DriverClass {
    public static void main(String[] args) {
        try{
            Resident john = new Resident(0001,"John","Doe");
            john.setTenant(true);

            Address apartmentAddress = new Address("AP01","NYC");
            Apartments apartment = new Apartments(apartmentAddress,3000,2500);

            Address rowHouseAddress = new Address("RH01","CA");
            Property rowHouse = new RowHouse(rowHouseAddress,2,1000,500);

            LocalDate moveInDate = LocalDate.of(2021,1,21);
            LocalDate moveOutDate = LocalDate.of(2021,12,31);

            Lease lease = new Lease(john,1, moveInDate,moveOutDate,apartment);
        }
        catch(IllegalTenantException e){
            System.out.println("Already a tenant");
            e.printStackTrace();
        }
        catch (EmptyMoveInDateException e){
            System.out.println("Move in date cannot be null");
            e.printStackTrace();
        }
        catch(EmptyMoveOutDateException e){
            System.out.println("Move out date cannot be null");
            e.printStackTrace();
        } catch (InvalidDurationException e) {
            System.out.println("move in date cannot be greater than move out date");
            e.printStackTrace();
        }
    }
}
