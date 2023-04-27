package com.una.models.collaborator;

import java.text.CollationKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collaboratorContainer {
    static Scanner sc = new Scanner(System.in);
    private static Map<String, collaboratorEntity> cCollaborator = new HashMap<>();
    public static boolean exist(String id){
        return cCollaborator.containsKey(id);
    }
    public static boolean add(collaboratorEntity u){
        if(!cCollaborator.containsKey(u.getId())){
            cCollaborator.put(u.getId(), u);
            return true;
        }
        return false;
    }
    public static collaboratorEntity find(String id){
        collaboratorEntity user;
        if(cCollaborator.containsKey(id)){
            user=cCollaborator.get(id);
            return user;
        }
        return null;
    }
    public static String update(String id) {
        if (cCollaborator.containsKey(id)) {
            collaboratorEntity collaborator = cCollaborator.get(id);
            System.out.println("Data to change: ");
            System.out.println("1. Name\n2. ID\n3. Phone\n4. Email\n5. Speciality\n6. Status");
            int opc = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opc) {
                case 1:
                    System.out.println("Enter the new name: ");
                    String newName = sc.nextLine();
                    collaborator.setName(newName);
                    return "Collaborator name updated successfully.";

                case 2:
                    System.out.println("Enter the new ID: ");
                    String newId = sc.nextLine();
                    collaborator.setId(newId);
                    return "Collaborator ID updated successfully.";

                case 3:
                    System.out.println("Enter the new phone number: ");
                    String newPhone = sc.nextLine();
                    collaborator.setPhone(newPhone);
                    return "Collaborator phone number updated successfully.";

                case 4:
                    System.out.println("Enter the new email: ");
                    String newEmail = sc.nextLine();
                    collaborator.setEmail(newEmail);
                    return "Collaborator email updated successfully.";

                case 5:
                    System.out.println("Enter the new speciality: ");
                    String newSpeciality = sc.nextLine();
                    collaborator.setSpeciality(newSpeciality);
                    return "Collaborator speciality updated successfully.";

                case 6:
                    System.out.println("Enter the new status: ");
                    String newStatus = sc.nextLine();
                    collaborator.isActive(newStatus);
                    return "Collaborator status updated successfully.";

                default:
                    return "Invalid option. No changes were made.";
            }
        }

        return "Collaborator not found. Update operation unsuccessful.";
    }

}
