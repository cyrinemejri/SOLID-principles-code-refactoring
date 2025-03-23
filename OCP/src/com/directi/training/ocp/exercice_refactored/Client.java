package com.directi.training.ocp.exercice_refactored;

public class Client {
    public static void main(String[] args) {
        ResourceAllocator allocator = new ResourceAllocator();
        
        Resource timeSlot = new TimeSlotResource();
        int timeSlotId = allocator.allocate(timeSlot);
        allocator.free(timeSlot, timeSlotId);

        Resource spaceSlot = new SpaceSlotResource();
        int spaceSlotId = allocator.allocate(spaceSlot);
        allocator.free(spaceSlot, spaceSlotId);
    }

}
