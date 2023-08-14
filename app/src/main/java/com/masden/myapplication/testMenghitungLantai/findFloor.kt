package com.masden.myapplication.testMenghitungLantai


fun findFloor(lockerNumber: Int): Int {
    var currentLocker = 1
    var floor = 1
    var lockersPerFloor = 5

    while (currentLocker + lockersPerFloor - 1 < lockerNumber) {
        currentLocker += lockersPerFloor
        lockersPerFloor++

        floor++

        if (floor == 4) {
            lockersPerFloor = 5
        }
        else if (floor == 5) {
            lockersPerFloor = 6
        }
        else if (floor == 6) {
            lockersPerFloor = 7
        }
    }

    return floor
}

fun main() {
    print("Masukkan nomor loker: ")
    val lockerNumber = readLine()!!.toInt()
    val floor = findFloor(lockerNumber)
    println("Lantai: $floor")
}





