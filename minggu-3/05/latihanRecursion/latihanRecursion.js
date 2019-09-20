function isEven(z) {
	if (n == 1) return false;
	else if (n == 0) return true;
	else if (n <= -1) return is Even(-n);
	else return isEven(n-2);
}

console.log(isEven(75));

console.log(isEven(50));

console.log(isEven(-1));