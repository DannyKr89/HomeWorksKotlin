package less5




class Employee(fio: String = "Василий Пупкин",
               position: String = "Уборщик",
               email: String = "vasyapupok@pochta.ru",
               phoneNumber: String = "89657451265",
               salary: Int = 18156,
               age: Int = 22) {

    var fio = fio
    var position = position
    var email = email
    var phoneNumber = phoneNumber
    var age = age
    var salary = salary

    override fun toString(): String {
        return "Employee: $fio\nPosition: $position\nEmail: $email\nPhone Number: $phoneNumber\nAge: $age\nSalary: $salary"
    }
}

