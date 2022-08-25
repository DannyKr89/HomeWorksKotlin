package less5

val employeeArray = Array<Employee>(5) { Employee() }

fun main(){
    employeeArray[0] = Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "89231231254", 30000, 30)
    employeeArray[1] = Employee("Жордж Тыква", "Поедатель пельменей", "empelmenivosne@pelmen.org", "88089380808", 3000, 18)
    employeeArray[2] = Employee("Вальдемар Кукухов", "Шутник", "kukuhapoehal88@taxi.ru", "88003553535", 23000, 41)
    employeeArray[3] = Employee("Лидия Петровна Ухова", "Андройд-разработчик", "lputhere@gmail.com", "89554165411", 145000, 58)
    employeeArray[4] = Employee()
    isEmployeeUnder40()
}

fun isEmployeeUnder40() {
    for (i in employeeArray.indices)
        if (employeeArray[i].age > 40){
            println(employeeArray[i].toString())
            println("_______________________________")
        }
}
