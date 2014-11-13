#!/usr/bin/perl

use	warnings;
use strict;

use Data::Dumper;
use DBD::mysql;
use DBI;
use SQL::Translator;
use Getopt::Long;

my %stmt_map = (

);

#
## Main
#

my ($source, $target)
GetOptions "source=s" => $source, "target=s" => $target;
