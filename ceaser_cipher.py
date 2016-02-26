a = raw_input()
a = list(a)
b = []
for number in range(26):
	b = []
	for char in range(len(a)):
		if ord(a[char])+number > ord("z"):
			b.append(chr(ord(a[char])+number-26))
		else:
			b.append(chr(ord(a[char])+number))

	print "".join(b)